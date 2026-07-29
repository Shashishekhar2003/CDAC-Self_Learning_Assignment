using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using EmployeeMVC.Models;
using EmployeeMVC.Data;

public class EmpsController : Controller
{
    private readonly AppDbContext _context;

    public EmpsController(AppDbContext context)
    {
        _context = context;
    }

    // GET: EMPSS
    public async Task<IActionResult> Index()
    {
        return View(await _context.Emps.ToListAsync());
    }

    // GET: EMPSS/Details/5
    public async Task<IActionResult> Details(int? empsid)
    {
        if (empsid == null)
        {
            return NotFound();
        }

        var emps = await _context.Emps
            .FirstOrDefaultAsync(m => m.EmpsId == empsid);
        if (emps == null)
        {
            return NotFound();
        }

        return View(emps);
    }

    // GET: EMPSS/Create
    public IActionResult Create()
    {
        return View();
    }

    // POST: EMPSS/Create
    // To protect from overposting attacks, enable the specific properties you want to bind to.
    // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
    [HttpPost]
    [ValidateAntiForgeryToken]
    public async Task<IActionResult> Create([Bind("EmpsId,Name,Dept")] Emps emps)
    {
        if (ModelState.IsValid)
        {
            _context.Add(emps);
            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }
        return View(emps);
    }

    // GET: EMPSS/Edit/5
    public async Task<IActionResult> Edit(int? empsid)
    {
        if (empsid == null)
        {
            return NotFound();
        }

        var emps = await _context.Emps.FindAsync(empsid);
        if (emps == null)
        {
            return NotFound();
        }
        return View(emps);
    }

    // POST: EMPSS/Edit/5
    // To protect from overposting attacks, enable the specific properties you want to bind to.
    // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
    [HttpPost]
    [ValidateAntiForgeryToken]
    public async Task<IActionResult> Edit(int? empsid, [Bind("EmpsId,Name,Dept")] Emps emps)
    {
        if (empsid != emps.EmpsId)
        {
            return NotFound();
        }

        if (ModelState.IsValid)
        {
            try
            {
                _context.Update(emps);
                await _context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!EmpsExists(emps.EmpsId))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }
            return RedirectToAction(nameof(Index));
        }
        return View(emps);
    }

    // GET: EMPSS/Delete/5
    public async Task<IActionResult> Delete(int? empsid)
    {
        if (empsid == null)
        {
            return NotFound();
        }

        var emps = await _context.Emps
            .FirstOrDefaultAsync(m => m.EmpsId == empsid);
        if (emps == null)
        {
            return NotFound();
        }

        return View(emps);
    }

    // POST: EMPSS/Delete/5
    [HttpPost, ActionName("Delete")]
    [ValidateAntiForgeryToken]
    public async Task<IActionResult> DeleteConfirmed(int? empsid)
    {
        var emps = await _context.Emps.FindAsync(empsid);
        if (emps != null)
        {
            _context.Emps.Remove(emps);
        }

        await _context.SaveChangesAsync();
        return RedirectToAction(nameof(Index));
    }

    private bool EmpsExists(int? empsid)
    {
        return _context.Emps.Any(e => e.EmpsId == empsid);
    }
}